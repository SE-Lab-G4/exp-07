# MiniJava
Mini-Java is a subset of Java. MiniJava compiler implement a compiler for the Mini-java
programming language.

# بخش اول
* اعمال الگوی Facade:
  برای کلاس‌های CodeGenerator و Parser، دو کلاس Facade ساخته شد تا پیجیدگی داخل این دو کلاس را پنهان کند و یک رابط ساده برای ارتباط با آنها ارائه کند
* پلی مورفیسم بجای شرط:
  در کلاس SymbolType یک پارامتر به Enum ها اضافه شد که VarType مربوط به هر مورد را ذخیره کند، و همین امر کمک کرد switch مختلف از بین بروند و تنها گرفتن مقدار varType انجام شود.
* اعمال Separate Query From Modifier:
  برای این مورد در کلاس Memory، به جای توابع get قبلی، دو تابع جدید نوشته شده اند، که یکی وظیفه‌اش تنها get کردن و دیگری increment کردن است. 
* اعمال Self Encapsulated Field:
  در کلاس‌ Address این مورد انجام شده است.