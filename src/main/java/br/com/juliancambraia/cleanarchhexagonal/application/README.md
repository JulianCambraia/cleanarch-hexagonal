# Package <p style="color:blue">Application</p>
````
Neste pacote é onde teremos todas as nossas Regras de Negócio
que não terão acesso externo a aplicação
ou seja livre de frameworks ficando totalmente isolada
````
## Package <p style="color:blue">CORE</p>

   #### Sub-package <p style="color:blue">DOMAIN</p>
````
Contém as classes de Domínio, livres de frameworks, annotations, evitando com isso
expor para o mundo externo estas informações.
````
   #### Sub-package <p style="color:blue">USECASE</p>
````
Contém os casos de uso, com as regras de negócio
````