package FactoryMethod.sample_2

import kotlin.system.measureNanoTime

interface Computer {
    val ssd: String
    val ram: String
    val cpu: String
}

class PC(
        override val ssd: String,
        override val ram: String,
        override val cpu: String) : Computer

class Server(
        override val ssd: String,
        override val ram: String,
        override val cpu: String) : Computer

enum class ComputerType {
    PC, SERVER
}

class ComputerFactory {
    fun getComputer(computerType: ComputerType): Computer? {
        var computer: Computer? = null

        when (computerType) {
            ComputerType.PC       -> computer = PC(ssd = "100GB", ram = "8GB", cpu = "2GHz")
            ComputerType.SERVER   -> computer = Server(ssd = "500GB", ram = "32GB", cpu = "3GHz")
        }

        return computer
    }
}

fun main(args: Array<String>) {

    val timeElapsed = measureNanoTime { val pc = ComputerFactory().getComputer(ComputerType.PC) }
    print(timeElapsed)

}