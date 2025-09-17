# Лабораторная работа 3 — Переводчик

## Инструкция по запуску с кириллицей

1. Откройте **PowerShell** или **CMD**.

2. Перейдите в папку со скриптами src, например:

H:\Student\labs-open-pebble690\laba_3\src

3. Введите в консоли "chcp 65001", чтобы переключить кодировку консоли на UTF-8:

chcp 65001

4. Скомпилируйте все Java файлы:

javac -encoding UTF-8 *.java

5. Запустите программу:

java -Dfile.encoding=UTF-8 Main

6. Введите путь до словаря:

../dictionary.txt

7. Введите слоов и получите перевод (если слово есть в словаре):

Enter text to translate:
dog
Translation result:
собака