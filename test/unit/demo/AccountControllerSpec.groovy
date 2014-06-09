package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(AccountController)
class AccountControllerSpec extends Specification {

   def register = {
        // registration details
        if (request.method == 'POST') {
            // create domain object and assign parameters using data binding
            def account = new Account(params)
            account.passwordHashed = account.password.encodeAsPassword()
            if (! account.save()) {
                // validation failed, render registration page again
                return [account:account]
            } else {
                // validate/save ok, store user in session, redirect to homepage
                session.account = account
                redirect(controller:'main')
            }
        } else if (session.account) {
            // don't allow registration while user is logged in
            redirect(controller:'main')
        }
    }
 
    def login = {
        if (request.method == 'POST') {
            def passwordHashed = params.password.encodeAsPassword()
            def u = account.findByUsernameAndPasswordHashed(params.username, passwordHashed)
            if (u) {
                // username and password match -> log in
                session.account = u
                redirect(controller:'main')
            } else {
                flash.message = "User not found"
                redirect(controller:'main')
            }
        } else if (session.account) {
            // don't allow login while user is logged in
            redirect(controller:'main')
        }
    }
 
    def logout = {
        session.invalidate()
        redirect(controller:'main')
    }
}
