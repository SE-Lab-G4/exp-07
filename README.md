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
* دو مورد بازآرایی دیگر: در کلاس CodeGenerator یک extract method انجام دادیم که از تکرار کد جلوگیری کند. بعلاوه در کلاس Main یک extract vaiable انجام دادیم.

   # بخش دوم

## سوال 1



* کد تمیز: کدی است که خوانا، قابل نگهداری و سازمان‌یافته باشد و اصول برنامه‌نویسی را به خوبی رعایت کند.

* بدهی فنی: به هزینه‌های ناشی از انتخاب‌های سریع و غیر بهینه در توسعه نرم‌افزار اشاره دارد که ممکن است در آینده نیاز به اصلاحات و تغییرات بیشتری داشته باشد که هزینه بیشتری به بار میاورد.

* بوی بد: نشانه‌هایی در کد است که علامتم وجود مشکلات ساختاری یا طراحی است و می‌تواند به کاهش کیفیت و خوانایی و کارایی کد منجر شود و نگهداری و توسعه را سخت میکند.


## سوال 2

* نوع Bloaters: این نوع از code smell به وضعیتی اشاره دارد که یک قطعه کد، کلاس یا متد به قدری بزرگ و حجیم می‌شود که کار با آن دشوار میشود. این مشکل معمولاً به صورت تدریجی و با گذر زمان ایجاد می‌شود و در نهایت منجر به کاهش قابلیت نگهداری، توسعه و خوانایی کد می‌شود.

* نوع Object Oriented Abusers: این نوع code smell ناشی از عدم درک صحیح از اصول و قواعد برنامه‌نویسی شیءگرا است، مانند وراثت یا پلی مورفیسم. این اشتباهات می‌توانند به طراحی‌های ناکارآمد و با کیفیت پایین منجر شوند.

* نوع Change Preventers: این نوع code smell زمانی بروز می‌کند که برای اعمال یک تغییر در کد، نیاز به تغییرات گسترده‌ای در بخش‌های دیگر کد باشد. این امر باعث کاهش قابلیت تغییر و گسترش کد می‌شود.

* نوع Dispensables: این نوع code smell به وجود قطعات کد، کلاس‌ها یا متدهایی اشاره دارد که هیچ استفاده‌ای ندارند. وجود این موارد باعث افزایش پیچیدگی و کاهش خوانایی کد می‌شود. حذف این کدهای اضافی به بهبود خوانایی و تمیزی کد کمک می‌کند.

* نوع Couplers: این نوع code smell زمانی رخ می‌دهد که یک قطعه کد، کلاس یا متد به طور مستقیم به دیگر قطعات کد متصل باشد. این وضعیت منجر به افزایش وابستگی (coupling) و کاهش همبستگی (cohesion) می‌شود، که این امر تست، توسعه و گسترش کد را دشوار می‌سازد.

## سوال 3
-  بوی بد **Feature Envy** در دسته **Couplers** قرار می‌گیرد، زیرا نشان‌دهنده این است که یک کلاس به طور غیرمعمولی به ویژگی‌ها و متدهای کلاس دیگری وابسته است.

- برای برطرف کردن این بوی بد، می‌توان از بازآرایی‌هایی مانند **Move Method** (انتقال متد به کلاس مناسب) و **Extract Class** (استخراج کلاس جدید برای ویژگی‌های مشترک) استفاده کرد.

- این بوی بد را می‌توان در مواقعی نادیده گرفت که تغییرات در کد به دلیل نیازهای فوری یا موقتی باشد و اصلاح آن به تأخیر نیفتد، یا زمانی که تأثیر منفی آن بر روی عملکرد کلی سیستم ناچیز باشد.
## سوال 4
1. تعریف و مفهوم:
   * Code Smell: به نشانه‌ها یا الگوهای داخل کد اشاره دارد که ممکن است نشان‌دهنده مشکلات طراحی یا ساختار کد باشد. این نشانه‌ها به خودی خود باعث بروز خطا نمی‌شوند، اما می‌توانند منجر به مشکلاتی در آینده شوند.
   * باگ: به خطاها یا اشکالاتی در کد اشاره دارد که باعث می‌شود برنامه به درستی کار نکند یا نتایج نادرستی تولید کند. باگ‌ها معمولاً نیاز به اصلاح فوری دارند.

2. تأثیر بر عملکرد:
   * Code Smell: ممکن است عملکرد برنامه را تحت تأثیر قرار ندهد، اما می‌تواند باعث کاهش کیفیت کد و افزایش هزینه‌های نگهداری در آینده شود.
   * باگ: به طور مستقیم بر عملکرد برنامه تأثیر می‌گذارد و می‌تواند منجر به کرش کردن برنامه یا تولید نتایج نادرست شود. باگ‌ها باید اصلاح شوند.


## سوال 5

1. Long Clasas: `src/com/project/lexicalAnalyzer/LexicalAnalyzer.java`, `    src/com/project/phase2CodeGeneration/Phase2CodeFileManipulator.java`.
2. Long Method: `getTokensOfPhase2Files` in `src/com/project/lexicalAnalyzer/LexicalAnalyzer.java`.
3. Switch Statement: in `src/com/project/lexicalAnalyzer/LexicalAnalyzer.java` and `src/com/project/phase2CodeGeneration/Phase2CodeFileManipulator.java`.
4. Data Clumps: in `src/com/project/phase2CodeGeneration/Phase2CodeFileManipulator.java`, about variables: `firstClassCalled`, `lastClassCalled`, `numberOfClassCalled`.
5. Primitive Obsession: in `src/com/project/graphBaseDependency/ClassNode.java` using dependencyCycleType could be replaced by enum.
6. Duplicate Code: in `src/com/project/phase1CodeGeneration/CompleteClass.java` methods: `generateDeleteDefinition()`, `generateDeleteBody()`,`generateDestructorDefinition()` there is same logic.
7. Data Class: class `src/com/project/graphBaseDependency/ClassNode.java`.
8. Inappropriate Intimacy: `src/com/project/phase2CodeGeneration/Phase2CodeFileManipulator.java` with `DiagramInfo` class.
9. Feature Envy: in `src/com/project/phase2CodeGeneration/Phase2CodeFileManipulator.java` accessing other classes too much.
10. Temporary Field: in `src/com/project/phase2CodeGeneration/ClassInfo.java` has some nullable fields.


## سوال 6
این پلاگین کمک می‌کند برخی استاندارد‌های ظاهری در سورس کد ما رعایت شده باشد. به عنوان مثال، تورفتگی‌ها، فاصله‌ها و چینش کد به خوبی و به صورت هماهنگ در کد شکل بگیرد. در نهایت، با استفاده از این پلاگین می‌توان خوانایی و تمیزی کد را بالا برد. به صورت غیر مستقیم این باعث افزایش کیفیت کد، کاهش احتمال خطا و به طور کلی نگهداری‌پذیری بیشتر کد با گذشت زمان می‌شود. در گام اول بازآرایی، در پروژه آزمایشگاه ذکر‌شده که می‌توان پس از انجام بازآرایی از این پلاگین استفاده کرد، به عبارتی دیگر به عنوانی گامی نهایی برای بازآرایی ظاهری می‌توانیم از این افزونه استفاده کنیم. البته به نظرم، استفاده از این افزونه پیش از بازآرایی هم از جنبه‌ای، با آشکارتر کردن ساختار کد و نشان دادن بهتر نقص‌های آن، می‌تواند بسیار مفید واقع شود.
