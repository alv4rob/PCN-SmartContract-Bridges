# Puentes tecnológicos entre PCN y smart contracts
Se trata de un conjunto de herramientas que actúan como puentes tecnológicos entre la notación de negocio **PCN** (Process Chain Network) y los **smart contracts** con el objetivo de acercar esta tecnología a profesionales del negocio. Para ello, estas herramientas permiten transformar diagramas PCN en smart contracts escritos en Solidity y viceversa, ambos modelados bajo el paradigma MDE (Model Driven Engineering).

Estas herramientas se construyen vinculadas a los siguientes plug-ins en el IDE Eclipse:
* [**INNoVaServ**](https://github.com/franciscoperezb/innovaserv_toolkit): Entorno de modelado para el diseño de servicios que soporta varias notaciones de negocio. A la definición de modelo PCN que incorpora este entorno se acopla un paquete que integra la funcionalidad del **puente PCN - smart contract**, con el que se pueden generar smart contracts en forma de modelo SmaC (*.sce*) a partir de modelos PCN (*.pcn*).
* [**SmaC**](https://github.com/CommITURJC/SmaC): DSL textual que soporta la codificación de smart contracts escritos en Solidity. A la definición de este DSL se acopla un paquete que integra la funcionalidad del **puente smart contract - PCN**, permitiendo generar modelos PCN (*.pcn*) a partir de modelos SmaC (*.sce*).

### Puente PCN - Smart contract
_______________
![Puente PCN - Smart Contract](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Videos/PCN-SmartContract_Demo.gif)
### Puente smart contract - PCN
_______________
![Puente smart contract - PCN](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Videos/SmartContract-PCN_Demo.gif)
