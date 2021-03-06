package domain;


import java.util.List;

/**
 *  Информация о способе размещения записи. Описание объекта находится на
 *  отдельной странице.
 *
 *  Поле возвращается только для Standalone-приложений
 *  с ключом доступа, полученным в implicit Flow.
 */


public class PostSource {

    /**
     *
     * Медиавложения записи (фотографии, ссылки и т.д.).
     * Описание массива находится на отдельной странице.
     */

    private List attachments;
}
