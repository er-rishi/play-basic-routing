package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Welcome to play basic routng example application."))
  }

  private def showMessgae(message: String) = Ok(views.html.index(message))

  def simple = Action {
    showMessgae("This is simple and static routing example.")
  }

  def clientId(id: Int) = Action {
    showMessgae(s"Id is $id. This is dynamic routing example with type defined.")
  }

  def userName(name: String) = Action {
    showMessgae(s"Name = $name. This dynamic routing example with no type defined.")
  }

  def file(name: String) = Action {
    showMessgae(s"File = $name. This is dynamic routing example with spanning several parts.")
  }

  def items(id: Long) = Action {
    showMessgae(s"Id = $id. This is dynamic routing example with regular expressions.")
  }

  def showFromPath(page: String) = Action {
    showMessgae(s"Page = $page. This is dynamic routing example for extracting the parameter from path.")
  }

  def showFromQueryString(page: String) = Action {
    showMessgae(s"Page = $page. This is dynamic routing example for extracting the parameter from query string.")
  }

  def showFix(page: String) = Action {
    showMessgae(s"Page = $page. This is dynamic routing example for fix value.")
  }

  def clientList(page: Int) = Action {
    showMessgae(s"Page No.= $page. This is dynamic routng example for default values.")
  }

  def list(dept: Option[Int]) = Action {
    val message = if (dept.isDefined) s"Dept id = $dept" else "Dept id = None"
    showMessgae(s"$message. This is dynamic routing example for optional value.")
  }
}
