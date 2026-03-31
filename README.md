# Spaghetti Lab - Refactorización

## Descripción
Este proyecto muestra la transformación de un sistema con Spaghetti Code a una arquitectura basada en patrones de diseño.

---

## Problema inicial
El sistema tenía múltiples condicionales anidados (6 niveles), lo que generaba:

- Alta complejidad
- Difícil mantenimiento
- Baja escalabilidad

---

## Solución

Se aplicaron:

### Strategy
Permite encapsular las reglas de descuento según el tipo de cliente.

### Command
Permite desacoplar la ejecución de acciones sobre pedidos.

---

## Estructura

- Pedido
- ProcesadorPedidos (versión inicial)
- EstrategiaDescuento
- DescuentoVIP / Premium / Estandar
- ComandoPedido
- ComandoProcesarPedido
- SelectorEstrategia

---

## Antes vs Después

| Antes | Después |
|------|--------|
| 6 niveles de if | 0 if anidados |
| Código rígido | Código flexible |
| Difícil extender | Fácil agregar estrategias |

---

## Ejecución

```bash
mvn compile
mvn exec:java