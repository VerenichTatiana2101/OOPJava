package lesson_05.ex003Math.Core.Presenters;

import lesson_05.ex003Math.Core.Infrastructure.Generator;
import lesson_05.ex003Math.Core.Models.Model;
import lesson_05.ex003Math.Core.Views.View;
import lesson_05.ex003Math.Mathematics.Exceptions.UnacceptableValueException;
import lesson_05.ex003Math.Mathematics.Shapes.Circle;
import lesson_05.ex003Math.Mathematics.Shapes.Rectangle;
import lesson_05.ex003Math.Mathematics.Shapes.Shape;

public class Presenter {
    Model model;
    View view;

    public Presenter(View view, Model model) {
        this.model = model;
        this.view = view;
    }

    public void append() throws UnacceptableValueException {
        view.set("1 - Circle, 2 - Rectangle");
        String response = view.get();
        Shape figure;

        switch (response) {
            case "1":
                figure = Circle.create(Generator.number(), "Circle_" + Generator.number());
                break;
            default:
                figure = Rectangle.create(
                    Generator.number(),
                    Generator.number(),
                    "Rectangle_" + Generator.number());
                break;
        }

        model.append(figure);
        view.set("ok");

    }

    public void show() {
        view.set(model.show());
    }

    public void showArea()
        {
            view.set(String.format("all Area %s", model.area()));
        }
}
