Ejercicio 18: File Manager
En un File Manager se muestran los archivos. De los archivos se conoce:
Nombre
Extensión
Tamaño
Fecha de creación
Fecha de modificación
Permisos

Implemente la clase FileOO2, con las correspondientes variables de instancia y accessors.

En el File Manager el usuario debe poder elegir cómo se muestra un archivo (instancia de la clase FileOO2), es decir, cuáles de los aspectos mencionados anteriormente se muestran,  y en qué orden.  Esto quiere decir que un usuario podría querer ver los archivos de muchas maneras. Algunas de ellas son:

nombre - extensión
nombre - fecha de creación - extensión
nombre - tamaño - permisos - extensión


Para esto, el objeto o los objetos que representen a los archivos en el FileManager debe(n) entender el mensaje prettyPrint(), retornando su nombre.

Es decir, un objeto cliente (digamos el FileManager) le enviará al objeto que Ud. determine, el mensaje prettyPrint(). De acuerdo a cómo el usuario lo haya configurado se deberá retornar un String con los aspectos seleccionados por el usuario en el orden especificado por éste. Considere que un mismo archivo podría verse de formas diferentes desde distintos puntos del sistema, y que el usuario podría cambiar la configuración del sistema (qué y en qué orden quiere ver) en runtime.

Tareas:
Discuta los requerimientos y diseñe una solución. Si aplica un patrón de diseño, indique cuál es y justifique su aplicabilidad.
Implemente en Java.
Instancie un objeto para cada uno de los ejemplos citados anteriormente y verifique escribiendo tests de unidad.
