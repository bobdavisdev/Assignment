package demo

class Follower implements Serializable {
	String followerId;
	String followingId;
	
	
    static constraints = {
		followerId blank : false , email:true
		followingId blank : false , email:true
    }
	
	
	static mapping = {
		table 'followers'		
		//id composite: ['followerId', 'followingId']
	}
}
