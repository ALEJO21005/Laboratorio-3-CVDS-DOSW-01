# Laboratorio-3-CVDS-DOSW-01
### Juan Andres Suarez Fonseca-Santiago Carmona-Sergio Alejandro Idarraga

# ✅RETO 1
## Reglas de Negocio😎✅
- Los números de cuenta deben tener exactamente 10 dígitos.
- Los dos primeros dígitos corresponden al código de un banco registrado (ejemplo: 01 BANCOLOMBIA, 02 DAVIVIENDA).
- Una cuenta bancaria no puede contener letras ni caracteres especiales, solo números.
- Una cuenta es válida únicamente si pertenece a un banco registrado.
- No se permite la creación de cuentas duplicadas.
- Solo se pueden realizar operaciones sobre cuentas válidas y existentes.
- El saldo de la cuenta de cada cliente no puede ser menor a cero

## Funcionalidades principales👌
- Cración cuenta bancaria que cumpla con las reglas de negocio antes de registrar la cuenta del cliente.
- Permitir al cliente consultar su saldo en la cuenta
- Permitir al cliente depositar dinero en su cuenta y actualizar el saldo en timepo real.


## Actores principales 🥸
- Cliente
- Sistema Bankify
- Bancos aliados

## Precondiciones del sistema "Bankify" 👈
- El sistema ya debe de tener un registro de bancos con los respectivos códigos asignados.

# ✅RETO 2

## Diagrama de contexto
<img width="970" height="515" alt="image" src="https://github.com/user-attachments/assets/2c3b3def-a91b-4055-8013-43aa00f62a5a" />

## Diagrama de casos de uso
<img width="737" height="392" alt="image" src="https://github.com/user-attachments/assets/2a54a50b-cf50-4e2f-94da-9930899e816c" />
<img width="802" height="482" alt="image" src="https://github.com/user-attachments/assets/8cca7e21-35d8-4eec-a5a2-b065d3c842c7" />
<img width="793" height="394" alt="image" src="https://github.com/user-attachments/assets/7fb51c5a-947f-4429-ae58-589f059ba9e5" />

## Tabla de excel con las historias de usuario creadas y atributo de calidad de cada uno
<img width="1070" height="320" alt="image" src="https://github.com/user-attachments/assets/899321cf-7944-4349-8f9c-1b8a09019af3" />

## Diagrama de clases
<img width="1122" height="525" alt="image" src="https://github.com/user-attachments/assets/2b1e2afe-1e11-4764-afc3-2d4c89980ef1" />

### La clase cuenta tiene la siguiente herencia:
<img width="426" height="377" alt="image" src="https://github.com/user-attachments/assets/a941d6e0-9237-4b1f-b42f-6c4fc7235dac" />

# ✅RETO 3
## CLASS PlanningPoker(main)
<img width="1113" height="572" alt="image" src="https://github.com/user-attachments/assets/cabafa02-9e45-4525-9fda-62fb35cd15f3" />
<img width="880" height="324" alt="image" src="https://github.com/user-attachments/assets/1f6f50e7-3c86-4ef2-82fe-c7a50a4319ce" />

## CLASS Integrante
<img width="629" height="424" alt="image" src="https://github.com/user-attachments/assets/38071eb5-5042-4734-9f3c-a694ba291886" />

## CLASS Tarea
<img width="625" height="462" alt="image" src="https://github.com/user-attachments/assets/68fbb4eb-6bc1-4017-8f38-d1d5393c54fb" />

## CLASS EstrategiaFibonacci
<img width="850" height="396" alt="image" src="https://github.com/user-attachments/assets/e573d233-7c0c-46de-af51-6eb2d33fdc75" />

## CLASS EstrategiaV(interfaz)
<img width="703" height="112" alt="image" src="https://github.com/user-attachments/assets/b917683d-255a-4ace-8ddc-b76e4468576a" />

## CLASS Votacion 
<img width="1044" height="553" alt="image" src="https://github.com/user-attachments/assets/ccedd778-215a-4aa1-bf0f-1abf7771aea1" />
<img width="793" height="419" alt="image" src="https://github.com/user-attachments/assets/b30ec2a9-630b-469a-b1ad-cc53273c86ae" />

# 😎 Patrones de diseño utilizados

## Strategy Pattern⚡:

Lo encontramos en EstrategiaV (interfaz) ,EstrategiaFibonacci (implementación concreta) y Integrante recibe en el constructor una estrategia de votación.

### Explicación:

El patrón Strategy permite definir diferentes algoritmos de votación sin modificar la lógica principal. En este caso, se usa EstrategiaFibonacci, pero podrían añadirse otras (EstrategiaTShirtSizes, EstrategiaCustom, etc.) sin alterar el código de Integrante.

## Beneficio
Facilita la extensión del sistema y mantiene el código abierto a nuevas estrategias sin modificar las clases existentes (Principio OCP).

# Principios solid 🤖
### SRP (Single Responsibility Principle)
- Tarea → gestiona la descripción y puntaje de la tarea.

- Integrante → representa a un miembro del equipo que vota.

- Votacion → controla el proceso de votación y consenso.

- EstrategiaV → define cómo se vota.

### OCP (Open/Closed Principle)
- Se pueden añadir nuevas estrategias de votación (EstrategiaX) sin modificar el código existente.
### LSP (Liskov Substitution Principle)
- Cualquier clase que implemente EstrategiaV puede sustituir a otra sin romper el sistema.
### ISP (Interface Segregation Principle)
- EstrategiaV es una interfaz pequeña y específica, enfocada únicamente en el comportamiento de votar.
# Ejecucion 💻💀
## Votos Iguales y Puntaje final
  <img width="814" height="438" alt="image" src="https://github.com/user-attachments/assets/34995e36-76ae-4be2-841c-9941b79716f0" />
  <img width="781" height="112" alt="image" src="https://github.com/user-attachments/assets/f400d8b9-cfae-472d-916b-94280ccb6510" />
  
 ## Votos divergentes
  <img width="831" height="437" alt="image" src="https://github.com/user-attachments/assets/8ba61132-f081-49b4-a360-0981bde60dec" />

# ✅RETO 5
<img width="611" height="569" alt="image" src="https://github.com/user-attachments/assets/b003adfc-8b15-4bbe-8903-5e245b4ca55d" />
<img width="554" height="564" alt="image" src="https://github.com/user-attachments/assets/d0675cea-a6b0-41d5-95d2-b6f426044e25" />
<img width="544" height="561" alt="image" src="https://github.com/user-attachments/assets/6777659f-b491-4c78-b0d5-b7790f2cc433" />
<img width="1195" height="153" alt="image" src="https://github.com/user-attachments/assets/0643319f-1735-4102-9d82-664ae6352e48" />
<img width="1194" height="244" alt="image" src="https://github.com/user-attachments/assets/aed6fa40-e12d-4965-8451-a9e080ac2875" />

## Cobertura inicial

El proyecto fue evaluado con *JaCoCo* para medir la cobertura de las pruebas unitarias.

- *Cobertura de instrucciones:* 96%  
- *Cobertura de ramas:* 65%  

Esto significa que el 96% de las líneas de código fueron ejecutadas por las pruebas, pero aún hay un 35% de condiciones (if, else, switch, etc.) que no han sido validadas. 































  
