package GameSnake.model.Physics
import GameSnake.model.objects.{ScreenBound, Snake}
class World {
  var playerOn: List[Snake] = List()
  var Boundry: ScreenBound = new ScreenBound(400,400)

}
