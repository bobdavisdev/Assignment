package demo

class Account {

    String email
    String fullName
	String password  	
	
	static hasMany = [Follower: Follower]
	
	// transients
	static transients = ['confirm']    
	
	// constraints
	static constraints = {
		fullName blank:false;
		email unique:true , blank : false , email:true;		
		password  blank:false, size:1..8;		
	}
	
    static mapping = {
        table 'accounts'		
    }
	
}
