# Package <p style="color:blue">ADAPTERS</p>
````
Contém as implementações das PORTAS de entrada (in) e saída (out).
````

## Package <p style="color:blue">(in)</p>
````
Contém as implementações das interfaces de entrada criadas no packege PORTS
````
### Sub-package <p style="color:blue">Controller</p>
````
Contém as chamadas a API Rest (Get,Post,Delete,Update)
````
### Sub-package <p style="color:blue">Consumer</p> 
````
   Contém as chamadas as (Filas QUEUES) Kafka Template
````

## Package <p style="color:blue">(out)</p>
````
   Contém as implementações das interfaces de saída criadas no packege PORTS (OUT)
   É a forma de como se saí para o mundo externo na aplicação. seja acessando um
   banco de dados ou realizando um requisição em outro Microsserviço 
   ou pra produzir mensagens na fila
````
### Sub-package <p style="color:blue">Client</p>
````
Será utilizado para acessar Microsserviços de busca do endereço do cliente por CEP
````
### Sub-package <p style="color:blue">Repository</p>
````
Será onde iremos acessar o banco de Dados MongoDB
````

# Package <p style="color:blue">CONFIG</p>
````
Pacote destinado a todas as configurações, beans do projeto
````