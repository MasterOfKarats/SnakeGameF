package GameSnake.model
import GameSnake.model.Physics.World
import GameSnake.model.objects.{ScreenBound, Snake}
import GameSnake.model.Physics.World
import play.api.libs.json.{JsValue, Json}
class Game {
  var playerSize: Int = 2
  var players: Map[String, Snake]
  var health: Int = 50
  var lastUpdateTime: Long = System.nanoTime()
  var world: World = new World
  var boundries = world.Boundry

  def loadGame(): Unit =
  {
    world = new World()
    boundries = world.Boundry
    health = health

  }
  def addPlayer(name:String): Unit =
  {
    if(players.contains(name) == false)
      {
        val nPlayer: Snake = new Snake(0,0, playerSize)
        players += (name -> nPlayer)
      }
  }
  def removePlayer(name:String): Unit =
  {

  }

  def updaterGame(): Unit =
  {

  }
  def GameState(): String =
  {
    val gameState: Map[String, JsValue] = Map(
      "gridSize" -> Json.toJson(Map("x" -> world.Boundry.x, "y" -> world.Boundry.y)),
      "maxBaseHealth" -> Json.toJson(health),
      "players" -> Json.toJson(this.players.map({ case (k, v) => Json.toJson(Map(
        "x" -> Json.toJson(v.x_p),
        "y" -> Json.toJson(v.y_p),
        "velocityX" -> Json.toJson(v.Xspeed),
        "velocityY" -> Json.toJson(v.YSpeed),
        "id" -> Json.toJson(k))) })),
    )

    Json.stringify(Json.toJson(gameState))

  }
}
