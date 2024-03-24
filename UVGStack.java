/**
 * Interfaz que define las operaciones básicas de una stack genérica.
 * Esta interfaz proporciona métodos para agregar elementos, quitar elementos,
 * obtener el elemento en la parte superior de la stack, verificar si la stack está vacía
 * y contar el número de elementos en la stack.
 *
 * @param <T> Tipo de datos de los elementos en la stack.
 * @author Gabriel Bran
 * @author David Dominguez
 * @author Luis Padilla
 * @since 2024-03-23
 * @version 1.0
 */
public interface UVGStack<T> {

    /**
     * Agrega un elemento a la parte superior de la stack.
     *
     * @param value Valor a agregar a la stack.
     */
    void push(T value);

    /**
     * Remueve y devuelve el elemento en la parte superior de la stack.
     *
     * @return Elemento en la parte superior de la stack.
     */
    T pop();

    /**
     * Devuelve el elemento en la parte superior de la stack sin removerlo.
     *
     * @return Elemento en la parte superior de la stack.
     */
    T top();

    /**
     * Verifica si la stack está vacía.
     *
     * @return true si la stack está vacía, false de lo contrario.
     */
    boolean isEmpty();

    /**
     * Devuelve el número de elementos en la stack.
     *
     * @return Número de elementos en la stack.
     */
    int count();
}
