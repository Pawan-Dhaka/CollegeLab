import turtle
screen = turtle.Screen()
t = turtle.Turtle()


def draw_dda(x1, y1, x2, y2):
    dx = x2 - x1
    dy = y2 - y1
    steps = max(abs(dx), abs(dy))
    x_in = dx / steps
    y_in = dy / steps
    x = x1 
    y = y1
    t.write(x)
    t.penup()
    t.goto(x,y)
    t.pendown()
    for _ in range(steps + 1):
        t.goto(x, y)
        x = x + x_in
        y = y + y_in
    t.write(x)

draw_dda(0, 0, 90 ,95)

turtle.done()
