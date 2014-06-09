import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_demoindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
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
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
invokeTag('textField','g',33,['name':("email"),'required':(""),'id':("email"),'type':("text"),'class':("input-medium"),'placeholder':("User Name")],-1)
printHtmlPart(10)
invokeTag('passwordField','g',41,['required':(""),'id':("password"),'name':("password"),'class':("input-medium"),'type':("password"),'placeholder':("********")],-1)
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('submitButton','g',49,['id':("signin"),'name':("signin"),'class':("btn btn-success")],3)
printHtmlPart(13)
})
invokeTag('form','g',53,['class':("form-horizontal"),'style':("width:50%;"),'url':([controller:'account',action:'login'])],2)
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('textField','g',63,['id':("email"),'name':("email"),'class':("input-large"),'type':("text"),'placeholder':("Valid Email Id"),'required':("")],-1)
printHtmlPart(16)
invokeTag('textField','g',71,['id':("fullName"),'name':("fullName"),'class':("input-large"),'type':("text"),'placeholder':("User Id"),'required':("")],-1)
printHtmlPart(17)
invokeTag('passwordField','g',79,['id':("password"),'name':("password"),'class':("input-large"),'type':("password"),'placeholder':("********"),'required':("")],-1)
printHtmlPart(18)
})
invokeTag('form','g',93,['class':("form-horizontal"),'style':("width:50%;"),'url':([controller:'account',action:'register'])],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',99,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402281619123L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 8, 21, 21, 21, 21, 22, 22, 23, 23, 33, 33, 33, 33, 41, 41, 49, 49, 49, 53, 53, 53, 63, 63, 63, 63, 71, 71, 79, 79, 93, 93, 93, 99, 99, 99, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
