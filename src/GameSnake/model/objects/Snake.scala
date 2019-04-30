package GameSnake.model.objects
import  GameSnake.model.Physics.size
import  GameSnake.model.Physics.eat

class Snake(x:Int,y:Int, s: Int) extends size(s:Int){
  var Xspeed = 0
  var YSpeed = 0
  var x_p = x
  var y_p = y
  var removed = false
  var startingsize: Int = 1
  def move(): Unit =
  {

  }
  def stop(): Unit =
  {

  }
  def grow(): Unit =
  {
    if(coll == true)
      {
        startingsize += 1
      }
  }
  def remove(): Boolean =
  {
    removed = true
    removed
  }
}
