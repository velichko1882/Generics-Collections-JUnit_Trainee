# Generics-Collections-JUnit_Trainee


Задача 1 

Необходимо реализовать класс валидации различных типов данных по некоторым простым правилам. 

Определим валидаторы только для трех типов Integer, String, Person (age, height). Правила валидации такие:

- Числа целого типа должны принадлежать интервалу [1,10] и [15,30].

- Строка должна начинаться с заглавной буквы и ее длина не должна превышать 15 символов.

- Person должен быть старше 16 лет и рост выше 160 см.

Класс получает на вход данные для валидации и в случае, если данные не соответствуют правилам, выдает исключение ValidationFailedException.

Для валидации строки использовать регулярные выражения.

Класс должен быть готов к расширению – добавление нового валидатора должно сводится к добавлению нового класса-валидатора и регистрации его в ValidationSystem.

Используйте Generics.



Задача 2

На базе HashSet создать класс, реализующий основные математические операции над множествами: объединение, пересечение, разность, исключение. 

Объединением (суммой) множеств А и В называется множество, элементы которого принадлежат хотя бы одному из этих множеств.

Например, если А={1,2,4}, B={3,4,5,6}, то result = {1,2,3,4,5,6}

Пересечением (произведением) множеств А и В называется множество, элементы которого принадлежат как множеству А, так и множеству В.

Например, если А={1,2,4}, B={3,4,5,2}, то result = {2,4}

Разностью множеств А и В называется множество АВ, элементы которого принадлежат множесву А, но не принадлежат множеству В.

Например, если А={1,2,3,4}, B={3,4,5}, то result = {1,2}

Симметричной разностью множеств А и В называется множество, являющееся объединением разностей множеств АВ и ВА
