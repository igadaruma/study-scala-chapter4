package controllers

import play.api.mvc._

import javax.inject._

@Singleton
class SampleController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index = Action { _ =>
    Ok("Chapter4！<br>はっじまっるよー！").as(HTML)
  }

}
