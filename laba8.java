import math

def solve_equation(a, b, c):
    """Находит корни квадратного уравнения ax² + bx + c = 0"""
    discriminant = b**2 - 4*a*c

    if discriminant > 0:
        x1 = (-b + math.sqrt(discriminant)) / (2*a)
        x2 = (-b - math.sqrt(discriminant)) / (2*a)
        return f"Два корня: x1={x1:.2f}, x2={x2:.2f}"
    elif discriminant == 0:
        x = -b / (2*a)
        return f"Один корень: x={x:.2f}"
    else:
        return "Нет действительных корней"

# Ввод данных и вывод результата
print("Решение квадратного уравнения ax² + bx + c = 0")
a = float(input("Введите a: "))
b = float(input("Введите b: "))
c = float(input("Введите c: "))

print(solve_equation(a, b, c))
