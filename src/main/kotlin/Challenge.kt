import java.util.*

public var input = Scanner(System.`in`);
fun main() {

    println("Assalamualaikum Kawan-Kawan")
    println("\n")
    println("===============================")
    print("Nama : ")
    val nama: String? = input.nextLine()

    if (nama.isNullOrEmpty()) {
        println("Wajib Diisi ya Senpai><")
        main()
    }
    print("Kelas : ")
    val kelas: String = input.nextLine()
    print("No Absen : ")
    val Absen = input.nextInt()
    print("GitHub : ")
    val git: String? = null
    val gitLength = git?.length ?: "eka-ant16"
    println(gitLength)
    println("================================")
    println("\n")
    menu()
}
fun menu(){
    println("==========Menu==========")
    println("1. Kerucut\n2. Tabung\n ")
    print ("Mao pilih yang mana : ")
    val select:Int? = input.nextInt()
    when (select) {
        1 -> kerucut()
        2 -> tabung()
        else -> {
            println("Pilihan tidak ada")
            menu()
        }
    }
}
fun kerucut() {
    println("================================");
    print("Masukan Tinggi Kerucut : ");
    val tinggi: Double = input.nextDouble();
    print("Masukan Jari-jari Kerucut : ");
    val jari: Double = input.nextDouble();

    val v: Double = (0.33333) * Math.PI * (jari * jari) * tinggi;
    println("================================");
    print("Volume dari kerucut adalah ");
    System.out.printf("%.2f", v);
    println()
    println("================================");
    println("\n")
    menu()

}
fun tabung() {
    println("================================");
    print("Masukan Tinggi tabung : ");
    var tinggi: Double? = null
    tinggi = input.nextDouble();
    print("Masukan jari-jari tabung: ");
    var jari: Double? = null
    jari = input.nextDouble();
    val v = Math.PI * jari * jari * tinggi;
    println("================================");
    print("Volume dari tabung adalah ")
    System.out.printf("%.2f", v);
    println()



}