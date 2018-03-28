/**
  * @author kerr
  **/
class WithDefault {
  def overload(arg1:String):String = arg1

  def overload(arg1:String,default: String):String = if (arg1 ne null) arg1 else default
}
