
fun main(){
    country("Kenya","Somalia","Libia","Ethiopia")

}



data class(var make:String,var model:String, var colour:String):String{
    fun cars(){
        var Prado= mutableListOf<String>()
        var benzz= mutableListOf<String>()
        var others= mutableListOf<String>()
        when("colours"){
            "Prado"->println(mutableListOf("$name","$colour"))
            "benzz"->println(mutableListOf("$name","$colours"))
            else->println(mutableListOf("$name","$colours"))
        }
    }

    var Benzz
    var cars:"taxi:","subaru","Benz"
    var colors:"blue","red","others"
    when(cars){
        is red->println(red)
    }

}
fun country(name1:String,name2:String,name3:String,name4:String):Array<String>{
    var countries=arrayOf(name1,name2,name3,name4)
    for (country in countries)
        if(country.length>4){
            println(country)
        }
    return length

}
class currentAccount(accountnumber:String,Accountname:String,balance:String):String{
    fun deposit=
}
