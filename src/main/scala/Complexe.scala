class Complexe(val entier: Int, val imaginaire: Int) {
    override def toString(): String = {
        (this.entier, this.imaginaire) match
            case (0,0) => "O"
            case (0,_) => s"${this.imaginaire}i"
            case (_,0) => s"${this.entier}"
            case (_,_) => s"${this.entier} + ${this.imaginaire}i"
    }
 
    def Créer(): String = {
        val complexe = s"${entier} + ${imaginaire}i"
        complexe
    }

    def +(complexe2: Complexe): Complexe = {
        val complexe = Complexe((this.entier + complexe2.entier), (this.imaginaire + complexe2.imaginaire))
        complexe
    }
}

object Complexe {
    def apply(entier1: Int, entier2: Int): Complexe = new Complexe(entier1, entier2)

    def Somme(complexes: List[Complexe]): Complexe = {
        complexes.reduce((acc,c) => acc + c )
    } 

    extension (start: List[Complexe])
        def summe(): Complexe = {
            Somme(start)
        } 
}