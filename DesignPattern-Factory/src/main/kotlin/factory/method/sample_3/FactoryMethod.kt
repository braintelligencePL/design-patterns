package factory.method.sample_3

import kotlin.system.measureNanoTime

interface Computer {
    val ssd: String
    val ram: String
    val cpu: String
}

data class PC(
        override val ssd: String,
        override val ram: String,
        override val cpu: String) : Computer

data class Server(
        override val ssd: String,
        override val ram: String,
        override val cpu: String) : Computer

enum class ComputerFactory {

    PC {
        override fun getComputer(): Computer {
            return PC(ssd = "100GB", ram = "8GB", cpu = "2GHz")
        }
    },
    SERVER {
        override fun getComputer(): Computer {
            return Server(ssd = "500GB", ram = "32GB", cpu = "3GHz")
        }
    };

    abstract fun getComputer(): Computer

}

fun main(args: Array<String>) {

    val timeElapsed = measureNanoTime { val pc = ComputerFactory.PC.getComputer() }
    println(timeElapsed)

}