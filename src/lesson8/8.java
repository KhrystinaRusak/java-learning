Библиотека
Определить класс Reader, хранящий такую информацию о пользователе библиотеки: 
ФИО и номер читательского билет.
Разработать программу, в которой создается массив объектов данного класса.
Перегрузить методы takeBook():
  - takeBook, который будет принимать количество взятых книг.
   Выводит на консоль сообщение "Петров В. В. взял 3 книги".
  - takeBook, который будет принимать переменное количество названий книг.
   Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
  - takeBook, который будет принимать переменное количество объектов класса Book (описание ниже).
   Метод также выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
Используя static, посчитать сколько раз читатели брали какие-либо книги.
Cоздать класс Book(используется как параметр в методе takeBook), Book должен содержать
  - название
  - автора книги
  - имя библиотеки (одинаковое для всех книг, например, Национальная библиотека)
  - метод, выводящий на конcоль сообщение: "Все книги принадлежат библиотеке: Национальная библиотека"
  
  public class Main {
  	Library library = new library();
	Reader reader = new Reader();
	
	System.out.println(Library.ticket);
	reader.writeRecord();
	
	reader.do();
	libarry.do();
  }
  
  public interface Reader {
  	String = "";
	void do();
	
  }
  
  public class Reader implements Reader, Library{
  	private String = ::
	private string = "";
	
	@Override
	public bod do() {
		SYtsme.out.println();
		
		@Override
		public Sting getType() {
			return type;
		}
	}
  }
  
  
  Домашнее задание

!!! Реализовать задание в отдельном классе в статических методах,
метод на вход (входным параметром) будет принимать строку.
В main впользователь вводит строку и программа вызывает статические методы, выводит результат.
Константы, используемые в методах, хранить в полях класса.

1) String methods
Напишите методы, который принимает в качестве параметра любую строку, например “I like Java!!!”.
1.1) Распечатать последний символ строки. Используем метод String.charAt().
1.2) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
1.3) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
1.4) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
1.5) Найти позицию подстроки “Java” в строке “I like Java!!!”.
1.6) Заменить все символы “а” на “о”.
1.7) Преобразуйте строку к верхнему регистру.
1.8) Преобразуйте строку к нижнему регистру.
1.9) Вырезать строку Java c помощью метода String.substring().

2) Номер документа
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
- Вывести на экран в одну строку два первых блока по 4 цифры.
- Вывести на экран номер документа, но блоки из трех букв заменить
на *** (каждая буква заменятся на *).
- Вывести на экран только одни буквы из номера документа в формате
yyy/yyy/y/y в нижнем регистре.
- Вывести на экран буквы из номера документа в формате
"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
класса StringBuilder).
- Проверить содержит ли номер документа последовательность abc и
вывети сообщение содержит или нет(причем, abc и ABC считается
одинаковой последовательностью).
- Проверить начинается ли номер документа с последовательности
555.
- Проверить заканчивается ли номер документа на
последовательность 1a2b.
Все эти методы реализовать в отдельном классе в статических методах,
которые на вход (входным параметром) будут принимать вводимую на вход программы строку.

3*) Дана строка произвольной длины с произвольными словами.
Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е слово в этой строке палиндромом.
Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов, а на вход программе передали число 500.
Палиндром - это слово или фраза, которые одинаково читаются слева направо и справа налево.
Пример слов:  боб, дед, кок, око, пуп, шиш.
Пример предложения-палиндрома: Я иду с мечем судия

4) ДОПОЛНИТЕЛЬНО ПО ОПП
Создать несколько объектов фотографий.
Фотографии бывают печатные (глянцевые или матовые) и электронные (имя файла, расширенрие, размер, расширение).
Собрать фотоальбом. У каждого альбома есть название, тематика и автор.
Альбом бывает печтаный (к каждой фотографии есть возможность написать комментарий) и электронный (содержит имя папки).
Печатный альбом состоит из страниц, куда помещается до 4 фотографий, и к каждой можно написать комментарий.
Электронный альбом состоит из папки с именем, внутри которой может быть еще папка или до 10 фотографий.
Создать фотовыставку, где могут участвовать как электронные, так и печатные фотографии - до 5.
Вывести кратную информацию о выставке (информация о представвленных альбомах).
Вывести подробную информацию о выставке (информация о представвленных фотографиях в каждом альбоме).
