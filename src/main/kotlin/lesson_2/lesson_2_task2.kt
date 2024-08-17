package lesson_2

//Задача 2 к Уроку 2
//
//В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
// Пишем часть гипотетического софта для бухгалтерии, который будет считать:
//
//– Расходы на выплату зарплаты постоянных сотрудников;
//– Общие расходы по ЗП после прихода стажеров;
//– Среднюю ЗП одного сотрудника после устройства стажеров.
//
//Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.

fun main() {
    val salaryOfSenior: Int = 30_000
    val salaryOfJunior: Int = 20_000
    val numberOfSeniorDevelopers: Int = 50
    val numberOfJuniorDevelopers: Int = 30

    val costsSalaryOfSeniorDeveloper: Int   // Расходы на выплату зарплаты постоянных сотрудников
    val companySalaryAmount: Int   // Общие расходы по ЗП после прихода стажеров
    val companyAverageSalary: Int   // Среднюю ЗП одного сотрудника после устройства стажеров

    costsSalaryOfSeniorDeveloper = salaryOfSenior * numberOfSeniorDevelopers
    println("Расходы на выплату зарплаты постоянных сотрудников: $costsSalaryOfSeniorDeveloper")

    companySalaryAmount = (salaryOfSenior * numberOfSeniorDevelopers) + (salaryOfJunior * numberOfJuniorDevelopers)
    println("Общие расходы по ЗП после прихода стажеров: $companySalaryAmount")

    companyAverageSalary = companySalaryAmount / (numberOfSeniorDevelopers + numberOfJuniorDevelopers)
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $companyAverageSalary")


}