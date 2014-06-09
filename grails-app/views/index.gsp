<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<r:require modules="bootstrap"/>
		<title>Tweet Pal</title>		
	</head>
	<body >
	
 <div>
		
		<div class="bs-example bs-example-tabs">
            <ul id="myTab" class="nav nav-tabs">
              <li class="active"><a href="#signin" data-toggle="tab">Sign In</a></li>
              <li class=""><a href="#signup" data-toggle="tab">Register</a></li>              
            </ul>
    </div>
      <div class="modal-body">
        <div id="myTabContent" class="tab-content">
        
		        <g:if test="${flash.message}">
		          <div class="message">${flash.message}</div>
		     	</g:if>
		     	
		        <div class="tab-pane fade active in" id="signin">
		        	<g:form class="form-horizontal" style="width:50%;" url="[controller:'account',action:'login']">
		               <fieldset>
				            <!-- Sign In Form -->
				            <!-- Text input-->
				            <div class="control-group">
				              <label class="control-label" for="email">Email :</label>	              
				              <div class="controls">
				                <g:textField name="email" required="" id="email" type="text" class="form-control" placeholder="User Name" class="input-medium" />
				              </div>
				            </div>
				
				            <!-- Password input-->
				            <div class="control-group">
				              <label class="control-label" for="password">Password:</label>
				              <div class="controls">
				                <g:passwordField required="" id="password" name="password" class="form-control" type="password" placeholder="********" class="input-medium" />
				              </div>
				            </div>
				
				            <!-- Button -->
				            <div class="control-group">
				              <label class="control-label" for="signin"></label>
				              <div class="controls">
				                <g:submitButton id="signin" name="signin" class="btn btn-success" >Sign In</g:submitButton >
				              </div>
				            </div>
				         </fieldset>
				      </g:form>
				</div>
					        <div class="tab-pane fade" id="signup">
					            <g:form class="form-horizontal" style="width:50%;" url="[controller:'account',action:'register']">
					            	<fieldset>
					            	<!-- Sign Up Form -->
					            	<!-- Text input-->
					            <div class="control-group">
					              <label class="control-label" for=email>Email:</label>
					              <div class="controls">
					                <g:textField id="email" name="email" class="form-control" type="text" placeholder="Valid Email Id" class="input-large" required=""/>
					              </div>
					            </div>
					            
					            <!-- Text input-->
					            <div class="control-group">
					              <label class="control-label" for="fullName">Full Name:</label>
					              <div class="controls">
					                <g:textField id="fullName" name="fullName" class="form-control" type="text" placeholder="User Id" class="input-large" required=""/>
					              </div>
					            </div>
					            
					            <!-- Password input-->
					            <div class="control-group">
					              <label class="control-label" for="password">Password:</label>
					              <div class="controls">
					                <g:passwordField id="password" name="password" class="form-control" type="password" placeholder="********" class="input-large" required=""/>
					                <em>1-8 Characters</em>
					              </div>
					            </div>			            
					            			            
					                        
					            <!-- Button -->
					            <div class="control-group">
					              <label class="control-label" for="confirmsignup"></label>
					              <div class="controls">
					                <button id="confirmsignup" name="confirmsignup" class="btn btn-success">Sign Up</button>
					              </div>
					            </div>
				            </fieldset>
			            </g:form>
			     	 </div>
    		</div>
      </div>
		</div>
		
	</body>
</html>
