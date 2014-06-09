package demo

class AccountController {

	// Activities for the landing page after login
	def renderLandingPage = {	
		
		def followerList =
		Account.executeQuery("select f.followerId as email from Account as a,Follower as f where " +
					 "a.email = f.followingId and f.followingId =  :email ",
					 [email:params.email]);
				 
				 
		
		def followingList =
		Account.executeQuery("select f.followingId as email from Account as a,Follower as f where " +
					 "a.email = f.followerId and f.followerId = :email",
					 [email:params.email]);
		
		
		def toFollowList =
		Account.executeQuery("from Account as a where a.email != :email and " +
					"a.email not in (select f.followingId from Follower f where f.followerId = :email)",					 
					 [email:params.email]);
				 
		respond Account.list(params),model:[follower:followerList,following:followingList,toFollow:toFollowList] ,view:'../landingPage';
				
	}
	
	// User Sign Up action
    def register = {
        // new user posts his registration details
        if (request.method == 'POST') {
            // create domain object and assign parameters using data binding
            def u = new Account(params)
            //u.passwordHashed = u.password.encodeAsPassword()
            if (! u.save()) {
                // validation failed, render registration page again
                return [account:u]
            } else {
                // validate/save ok, store user in session, redirect to homepage
                session.account = u;
								
				forward action: "renderLandingPage", account: u ;
            }
        } else if (session.account) {
            // don't allow registration while user is logged in
		
			forward action: "renderLandingPage", account: session.account ;
        }
    }
	
	// User Login  action
 
    def login = {
        if (request.method == 'POST') {
          
            def u = Account.findByEmailAndPassword(params.email, params.password)
            if (u) {
                // username and password match -> log in
                session.account = u
				forward action: "renderLandingPage", account: u ;
                
            } else {
                flash.message = "User not found"
                render (view:'../index.gsp')
            }
        } else if (session.account) {
            // don't allow login while user is logged in
            forward action: "renderLandingPage", account: session.account ;
        }
    }
	
	
	//User Follow Action
	def follow(Follower instance) {		
		if (request.method == 'POST') {			
			  //def u = Account.findByEmail(instance.)
			  if (session.account && instance != null ) {
				  // username and password match -> log in
				  instance.save flush:true;				  
				  flash.message = "Following successfully .. "
				  forward action: "renderLandingPage", params: [email:instance.followerId] ;
				
			  } else {
				  flash.message = "Error Something went wrong try again later."
			  }		  
		  }
	}
	
 
	// User Logout action
    def logout = {
        session.invalidate()
        render (view:'../index.gsp')
    }
}
