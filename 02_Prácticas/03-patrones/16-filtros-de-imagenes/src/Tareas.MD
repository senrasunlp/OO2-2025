3)
* Template Method
  * a. No. no se muestra ningún uso del Template method.
  * b. La estructura no coincide con la de un Template Method, si fuera el caso en la clase Abstracta Filter tendría que haber algún template method que utilicen las subclases.
  * c. N/A.
* Strategy
  * a. No aplica, no se aplican un único filtro a la vez como se hace en un Strategy.
  * b. Si bien comparte que los filtros extienden la clase Filter, la imagen no tiene una única Strategy a la vez (filtro).
  * c. N/A.
* Decorator
  * a. Si, se cuentan con varios filtros que se pueden aplicar sucesivamente a una misma imagen.
  * b. No coincide exactamente la estructura y los participantes de Decoretor. BufferedImage y Filter no heredan de un mismo Componente, y los filtros no se van encadenando uno a uno. Se aplica el filtro a la imagen y este retorna una imagen. No se hace una "Mamushka".
  * c. Por lo que veo en la implementación, una vez aplicado el filtro oya no se puede quitar.