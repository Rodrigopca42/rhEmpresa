# rhEmpresa
 Desenvolvimento de estudo de herança, polimorfismo, upcasting e downcasting, sobreposição, “super” e anotação @Override em Java.
 
 Nesse projeto foi montado um sistema de uma empresa que possui funcionários próprios e terceirizados.  Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
 
 Funcionários terceirizados possuem ainda uma despesa adicional.
 
 O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
 
 O programa deve ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
 
 Este é o modelo que ser serguido:
 
 Enter the number of employees: 3
Employee #1 data:
Outsourced (y/n)? n
Name: Alex
Hours: 50
Value per hour: 20.00

Employee #2 data:
Outsourced (y/n)? y
Name: Bob
Hours: 100
Value per hour: 15.00
Additional charge: 200.00

Employee #3 data:
Outsourced (y/n)? n
Name: Maria
Hours: 60
Value per hour: 20.00

PAYMENTS:
Alex - $ 1000.00
Bob - $ 1720.00
Maria - $ 1200.0
