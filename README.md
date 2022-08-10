# rhEmpresa
 Desenvolvimento de estudo de herança, polimorfismo, upcasting e downcasting, sobreposição, “super” e anotação @Override em Java.
 
 Nesse projeto foi montado um sistema de uma empresa que possui funcionários próprios e terceirizados.  Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
 
 Funcionários terceirizados possuem ainda uma despesa adicional.
 
 O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
 
 O programa deve ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
 
 Este é o modelo que ser serguido:
 
 Enter the number of employees: 3 <br>
Employee #1 data:<br>
Outsourced (y/n)? n<br>
Name: Alex<br>
Hours: 50<br>
Value per hour: 20.00<br>
<br>
Employee #2 data:<br>
Outsourced (y/n)? y<br>
Name: Bob<br>
Hours: 100<br>
Value per hour: 15.00<br>
Additional charge: 200.00<br>
<br>
Employee #3 data:<br>
Outsourced (y/n)? n<br>
Name: Maria<br>
Hours: 60<br>
Value per hour: 20.00<br>
<br>
PAYMENTS:<br>
Alex - $ 1000.00<br>
Bob - $ 1720.00<br>
Maria - $ 1200.0<br>
