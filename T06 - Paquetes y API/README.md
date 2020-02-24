# Tema 6 - Paquetes y API

Material de apoyo para las clases de teoría de Programación en Entornos Distribuidos. Este repositorio incluye listados con los conceptos explicados en clase así como algunos ejemplos creados en las propias clases.

(c) 2020, Gorka Prieto Agujeta <<gorka.prieto@ehu.eus>>

## Paquetes

Ventajas:
- Espacio de nombres
- Librerías

Recomendaciones:
- `ped.ehu.eus` -> `eus.ehu.ped`
- Todo en minúsculas

Ejemplo anidamiento:
```
eus
	ehu
		ped
		sta
	gobierno
		admin
		hacienda (-> eus.gobierno.hacienda)
```

¡Cuidado!
- El nombre del paquete y el subdirectorio tienen que coincidir!!
- No os olvidéis de eliminar los imports que no uséis. Lo puede hacer Netbeans automáticamente:
(imgs/save.png)