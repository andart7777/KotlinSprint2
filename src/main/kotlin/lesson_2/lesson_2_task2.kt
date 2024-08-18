package lesson_2

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