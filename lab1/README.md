# Особливості дотримання принципів програмування

У своєму коді я дотримався таких принципів: SOLID,YAGNI,DRY,KISS.
- SRP(принцип єдиної відповідальності) у коді проявляється в тому що всі класи створенні для виконання лише однієї задачі(представлення сутності або ж інші функції.).
Наприклад : клас [Dollar](https://github.com/mvyu222/Design-Patterns/blob/master/lab1/src/money/Dollar.java) створенний для представлення долара, клас [SaveMoneyToDataBase](https://github.com/mvyu222/Design-Patterns/blob/master/lab1/src/money/save_money/SaveMoneyToDataBase.java) створенний для запису сутності [Money](https://github.com/mvyu222/Design-Patterns/blob/master/lab1/src/money/Money.java) у базу даних.
- OCP(принцип відкритості/закритості) у коді проявляється в тому що сутності відкриті для розширення але закриті для змін.
Наприклад : клас [Money](https://github.com/mvyu222/Design-Patterns/blob/master/lab1/src/money/Money.java) являє собою інтерфейс-представлення грошової одиниці, він відкритий для розширення але закритий для змін.
- LSP(принцип підстановки Лісков) у коді проявляється в тому що об'єкти в програмі можуть бути заміненими їхніми нащадками без зміни коду програми.
Наприклад : клас [Dollar](https://github.com/mvyu222/Design-Patterns/blob/master/lab1/src/money/Dollar.java) наслідується від дефолтної реалізації інтерфейсу Money - [MoneyImpl](https://github.com/mvyu222/Design-Patterns/blob/master/lab1/src/money/MoneyImpl.java) і може змінювати поля свого батьківського класу та може бути заміненим батьківським класом.
- ISP(принцип розділення інтерфейсу) у коді проявляється в тому що створено багато спеціалізованих інтерфейсів кращих за один універсальний.
Наприклад : клас [Warehouse](https://github.com/mvyu222/Design-Patterns/blob/master/lab1/src/warehouse/Warehouse.java) є інтерфейсом який розширює інтерфейс Money(призначенний для зберігання продуктів на складі).
- DIP(принцип інверсії залежностей) у коді проявляється в тому що залежності всередині системи будуються на основі абстракцій.
Наприклад : клас [SaveMoneyToLocaleStorage](https://github.com/mvyu222/Design-Patterns/blob/master/lab1/src/money/save_money/SaveMoneyToLocaleStorage.java) має метод save який приймає інтерфейс Money,в не якусь певну реалізацію.
- DRY(Don't repeat yourself) код не містить дублювання інформації(Звісно якщо ми беремо в урахування верстку(якої немає в моєму коді) то дублювання є доцільним,адже при верстці важливо щоб код залишався
максимально читабельним).
- KISS (Keep It Simple, Stupid) у коді означає, що реалізація функцій повинна бути максимально простою і прямолінійною.
При використанні цього принципу важливо враховувати кінцевий результат і обирати шляхи до нього, які є найбільш простими та зрозумілими.
- YAGNI(You Aren’t Gonna Need It) зайвого функціоналу у коді не реалізовано.
