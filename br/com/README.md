# Aula04 - Introdução

Objetos instanciados em Java são acessados por sua referência, ou seja, pelo seu endereço de memória. Isso significa que dois objetos da classe `Usuário` instanciados com mesmo nome, sobrenome e email não são iguais quando comparados (`user1==user2`) a não ser que você atribua o `user1` igual ao `user2` no código e depois faça a comparação:

User u1 = new Conta();
User u2 = new Conta();
c1 == c2 // FALSE
c1 = c2
c1 == c2 // TRUE

### **Stack e Heap em Java**

A **stack** é uma região da memória que armazena informações de forma **temporária e organizada**. Ela é usada para armazenar:

- **Variáveis locais**, como valores de tipos primitivos (como `int`, `float`, `boolean`), que são armazenados diretamente na stack.
- **Referências a objetos** (endereços de memória) criados com `new`. A **referência** (não o objeto em si) é armazenada na stack, e ela aponta para o local na **heap** onde o objeto real está alocado.

A **heap** é a área da memória onde os **objetos reais** são armazenados. Quando você cria um objeto com `new` em Java, o objeto é alocado na heap, enquanto a **referência** para ele (armazenada na stack) aponta para o local na heap. A heap é mais **lenta para acessar** do que a stack, mas permite que os objetos sejam compartilhados entre diferentes métodos e threads.

### **Garbage Collector (GC)**

O **Garbage Collector (GC)** é um componente automático da **Java Virtual Machine (JVM)** responsável por gerenciar a memória da **heap**, onde ficam os objetos criados com `new`. Ele identifica e remove da memória objetos que não são mais utilizados — ou seja, que não possuem mais referências ativas no programa. Isso libera espaço para que novos objetos possam ser alocados, evitando vazamentos de memória.
O funcionamento é simples: periodicamente, o GC percorre os objetos da heap, verifica quais ainda podem ser acessados a partir da stack (ou de outros objetos), e descarta os que estão inacessíveis. Esse processo ocorre automaticamente e de forma invisível ao desenvolvedor, o que torna o gerenciamento de memória em Java muito mais seguro e prático.

# Aula05 - Arrays

Array de inteiros inicia com todas as posições em 0, mas array de objetos inicia com todas as posições em null.
