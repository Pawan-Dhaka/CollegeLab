import turtle

screen = turtle.Screen()
t = turtle.Turtle()


def draw_bres(x1, y1, x2, y2):
    dx = x2 - x1
    dy = y2 - y1
    m = dy / dx
    x = x1
    y = y1
    t.penup()
    t.goto(x, y)
    if abs(m) < 1:
        t.pendown()
        p = 2 * dy - dx
        while x < x2:
            t.goto(x, y)
            if p < 0:
                x = x + 1
                y = y
                p = p + 2 * dy
            else:
                x = x + 1
                y = y + 1
                p = p + 2 * dy - 2 * dx

    if abs(m) >= 1:
        t.pendown()
        p = 2 * dx - dy
        while x < x2:
            t.goto(x, y)
            if p < 0:
                x = x
                y = y + 1
                p = p + 2 * dx
            else:
                x = x + 1
                y = y + 1
                p = p + 2 * dx - 2 * dy


draw_bres(0, 0, 90, 95)

turtle.done()
