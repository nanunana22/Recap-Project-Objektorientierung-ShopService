import java.util.List;
//MyVersion


public record Order(
        String id,
        List<Product> products
) {
}
