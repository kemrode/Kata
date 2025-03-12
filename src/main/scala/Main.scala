import Complexe.Somme
@main def hello(): Unit =
  val complexe1: Complexe = Complexe(2, 3)
  val complexe2: Complexe = Complexe(5,9)
  val resultat = AdditionDeuxComplexes(complexe1, complexe2)
  println(s"Le calcul de la somme de deux complexes vaut: ${resultat}")

  val complexe3: Complexe = Complexe(1,10)
  val complexes: List[Complexe] = List(complexe1, complexe2, complexe3)
  val calculSuite = Somme(complexes)
  println(s"Le résulat de la somme d'une suite de complexe vaut: $calculSuite")

def AdditionDeuxComplexes(complexe1: Complexe, complexe2: Complexe): Complexe = {
  val complexeCalcule: Complexe = complexe1 + complexe2
  complexeCalcule
}
