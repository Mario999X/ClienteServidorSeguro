package security

import java.io.File
import java.io.FileInputStream
import java.nio.file.Paths
import java.util.*

object FicheroProperties {

    fun loadProperties(): Properties {
        val workingDir: String = System.getProperty("user.dir")
        // Fichero properties
        val ficheroProperties =
            Paths.get(workingDir + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "config.properties")

        val properties = Properties()

        // Cargamos el archivo
        properties.load(FileInputStream(ficheroProperties.toString()))

        return properties
    }
}