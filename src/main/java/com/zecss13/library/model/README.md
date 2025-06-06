# Models

Em models teremos todas as classes que representam os dados do sistema. Essas classes são usadas para mapear os dados do banco de dados e também podem ser usadas para transferir dados entre diferentes camadas da aplicação.

Models são escritos sem sufixo model, por exemplo:
```Book.java```  
Diferentemente de controllers, que são escritos com o sufixo Controller, por exemplo:
```BookController.java```

Isso porque os models são usados para representar os dados do sistema e seria redundante adicionar model nele, enquanto os controllers são usados para gerenciar as requisições e respostas da aplicação.

