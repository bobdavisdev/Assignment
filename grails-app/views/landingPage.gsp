<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<r:require modules="bootstrap"/>
		<title>Tweet Pal</title>		
	</head>
	<body  >

	
  <div>  
  <g:if test="${session?.account}">
				<div id="login" style="padding:10px;margin:5px;float:right">
		        		${session?.account?.fullName} |
		        	<g:link controller="account" action="logout">Logout</g:link></div>
		<!-- END #login -->
		    </g:if>
		 	<div class="bs-example bs-example-tabs">
		            <ul id="myTab" class="nav nav-tabs">
		              <li class="active"><a href="#followers" data-toggle="tab">Followers (${follower.size()}) </a></li>
		              <li class=""><a href="#following" data-toggle="tab">Following (${following.size()})</a></li>
		              <li class=""><a href="#follow" data-toggle="tab">Follow (${toFollow.size()})</a></li>            
		            </ul>
		    </div>
    
    
     		<div id="myTabContent" class="tab-content">     	
		     	<div class="tab-pane fade active in" id="followers">
		        	<g:each in="${follower}" status="i" var="followerElement">
							<div style="padding:10px;margin:5px;"><p >${followerElement}</p></div>				
					</g:each>
				</div>
				
				<div class="tab-pane fade" id="following">
					<g:each in="${following}" status="i" var="followingElement">
							<div style="padding:10px;margin:5px;"><p >${followingElement}</p></div>				
					</g:each> 		        	
				</div>
				
				<div class="tab-pane fade" id="follow">
		        	<g:each in="${toFollow}" status="i" var="toFollowElement">
		        	<g:form class="form-horizontal" url="[controller:'Account',action:'follow']">
		        		<input type="hidden" name="followingId" value="${fieldValue(bean: toFollowElement, field: "email")}" />
		        		<input type="hidden" name="followerId" value="${session?.account?.email}" />		        				        		
						<div  style="padding:10px;margin:5px;"><p >${fieldValue(bean: toFollowElement, field: "email")}
						<g:submitButton id="follow" name="follow" class="btn btn-success btn-small" ><i class="icon-white icon-ok"></i>Follow</g:submitButton>
						 </p></div>											 
					</g:form>					
					</g:each> 
				</div>
			</div>
		</div>	
	
	   
    </body>
    </html>