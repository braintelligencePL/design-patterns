package sample_1

import kotlin.system.measureNanoTime

interface Computer {
    val ssd: String
    val ram: String
    val cpu: String
}

class PC(
        override val ssd: String = "1GB",
        override val ram: String = "8GB",
        override val cpu: String = "2Ghz") : Computer

class Server(
        override val ssd: String = "500GB",
        override val ram: String = "32GB",
        override val cpu: String = "3Ghz") : Computer

enum class ComputerType {
    PC, SERVER
}

class ComputerFactory {
    fun getComputer(computerType: ComputerType): Computer? {
        var computer: Computer? = null

        when (computerType) {
            ComputerType.PC -> computer = PC()
            ComputerType.SERVER -> computer = Server()
        }

        return computer
    }
}

fun main(args: Array<String>) {

    val timeElapsed = measureNanoTime { val pc = ComputerFactory().getComputer(ComputerType.PC) }
    print(timeElapsed)

}