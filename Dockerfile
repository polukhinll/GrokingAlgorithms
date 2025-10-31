# Используем официальный образ Java
FROM openjdk:17-jdk-slim

# Создаем рабочую директорию
WORKDIR /app

# Копируем исходный код
COPY src ./src
COPY GrokingAlgorithms.iml .

# Создаем директорию для выходных файлов
RUN mkdir -p out

# Компилируем Java приложение
RUN javac -d out src/Chapter1/BinarySearch/theory/Main.java

# Указываем точку входа
CMD ["java", "-cp", "out", "Chapter1.BinarySearch.theory.Main"]