import turtle

screen = turtle.Screen()

t = turtle.Turtle()
t.speed(0)
t.penup()

xc = 0
yc = 0
r = 40

x = 0
y = r
p = 1 - r

while x < y:

    x = x + 1

    if p < 0:
        p = p + 2 * x + 1
    else:
        y = y - 1
        p = p + 2 * (x - y) + 1

    points = [
        (xc + x, yc + y),
        (xc - x, yc + y),
        (xc + x, yc - y),
        (xc - x, yc - y),
        (xc + y, yc + x),
        (xc - y, yc + x),
        (xc + y, yc - x),
        (xc - y, yc - x)
    ]

    for px, py in points:
        t.goto(px, py)
        t.dot(3)

screen.mainloop()