@main def hello(): Unit =
  val complexe1: Complexe = Complexe(2, 3)
  val complexe2: Complexe = Complexe(5,9)
  val resultat = AdditionDeuxComplexes(complexe1, complexe2)
  println(resultat)

def AdditionDeuxComplexes(complexe1: Complexe, complexe2: Complexe): Complexe = {
  val complexeCalcule: Complexe = complexe1 + complexe2
  complexeCalcule
}
