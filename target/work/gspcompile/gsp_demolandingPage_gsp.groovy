import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_demolandingPage_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/landingPage.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('require','r',5,['modules':("bootstrap")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
if(true && (session?.account)) {
printHtmlPart(6)
expressionOut.print(session?.account?.fullName)
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',15,['controller':("account"),'action':("logout")],3)
printHtmlPart(9)
}
printHtmlPart(10)
expressionOut.print(follower.size())
printHtmlPart(11)
expressionOut.print(following.size())
printHtmlPart(12)
expressionOut.print(toFollow.size())
printHtmlPart(13)
loop:{
int i = 0
for( followerElement in (follower) ) {
printHtmlPart(14)
expressionOut.print(followerElement)
printHtmlPart(15)
i++
}
}
printHtmlPart(16)
loop:{
int i = 0
for( followingElement in (following) ) {
printHtmlPart(14)
expressionOut.print(followingElement)
printHtmlPart(15)
i++
}
}
printHtmlPart(17)
loop:{
int i = 0
for( toFollowElement in (toFollow) ) {
printHtmlPart(18)
createTagBody(3, {->
printHtmlPart(19)
expressionOut.print(fieldValue(bean: toFollowElement, field: "email"))
printHtmlPart(20)
expressionOut.print(session?.account?.email)
printHtmlPart(21)
expressionOut.print(fieldValue(bean: toFollowElement, field: "email"))
printHtmlPart(22)
createClosureForHtmlPart(23, 4)
invokeTag('submitButton','g',46,['id':("follow"),'name':("follow"),'class':("btn btn-success btn-small")],4)
printHtmlPart(24)
})
invokeTag('form','g',48,['class':("form-horizontal"),'url':([controller:'Account',action:'follow'])],3)
printHtmlPart(25)
i++
}
}
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',55,[:],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402311036939L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 8, 12, 12, 12, 12, 14, 14, 15, 15, 15, 17, 17, 20, 20, 21, 21, 22, 22, 29, 29, 29, 29, 30, 30, 31, 31, 31, 31, 35, 35, 35, 35, 36, 36, 37, 37, 37, 37, 41, 41, 41, 42, 43, 43, 43, 43, 44, 44, 45, 46, 46, 46, 46, 48, 48, 49, 49, 49, 49, 49, 55, 55, 55, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "landingPage.gsp"
)
class ___LineNumberPlaceholder { }
