package knockoff2

import scala.util.parsing.input.Position
    
class UnorderedItem( items : Seq[ Block ], position : Position )
extends ListItem( items, position ) {
  
  def this( block : Block, position : Position ) =
    this( Seq( block ), position )
  
  def itemPrefix = "* "
  
  def + ( b : Block ) : ListItem =
    new UnorderedItem( children ++ Seq(b), children.first.position )
}
