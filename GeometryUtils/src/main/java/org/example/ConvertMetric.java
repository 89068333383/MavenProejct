package org.example;

public class ConvertMetric {
    public ConvertMetric() {
    }

    public static double converteMertricTo(double values, String metricOld, String metricNew) {
        switch (metricOld.toLowerCase()) {
            case "m": {
                values = values;
                break;
            }
            case "in": {
                values = values * 0.0254;
                break;
            }
            case "cm": {
                values = values * 0.01;
            }
            case "mm": {
                values = values * 0.001;
            }
            case "km": {
                values = values * 1000;
            }
            case "mi": {
                values = values * 1609.344;
                break;
            }
            default:
                values = values;

            switch (metricNew.toLowerCase()) {
                case "m": {
                    return values;
                }
                case "cm": {
                    return values * 100;
                }
                case "mm": {
                    return values * 1000;
                }
                case "km": {
                    return values / 1000;
                }
                case "mi": {
                    return values / 1609.344;
                }
                case "in": {
                    return values / 0.0254;
                }
                default:
                    return values;

            }

        }
        return values;

    }
}
