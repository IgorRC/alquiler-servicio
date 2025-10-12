INSERT INTO permissions (id, name, description) VALUES
                                                    (gen_random_uuid(), 'USERS_CREATE', 'Crear usuarios en el sistema'),
                                                    (gen_random_uuid(), 'USERS_VIEW', 'Ver usuarios'),
                                                    (gen_random_uuid(), 'USERS_UPDATE', 'Editar usuarios'),
                                                    (gen_random_uuid(), 'USERS_DELETE', 'Eliminar usuarios'),
                                                    (gen_random_uuid(), 'ROLES_MANAGE', 'Gestionar roles y permisos'),

                                                    (gen_random_uuid(), 'CLIENTS_CREATE', 'Registrar nuevo cliente'),
                                                    (gen_random_uuid(), 'CLIENTS_VIEW', 'Ver clientes'),
                                                    (gen_random_uuid(), 'CLIENTS_UPDATE', 'Editar clientes'),
                                                    (gen_random_uuid(), 'CLIENTS_DELETE', 'Eliminar clientes'),

                                                    (gen_random_uuid(), 'PROPERTIES_CREATE', 'Registrar propiedades'),
                                                    (gen_random_uuid(), 'PROPERTIES_VIEW', 'Consultar propiedades'),
                                                    (gen_random_uuid(), 'PROPERTIES_UPDATE', 'Editar propiedades'),
                                                    (gen_random_uuid(), 'PROPERTIES_DELETE', 'Eliminar propiedades'),

                                                    (gen_random_uuid(), 'SALES_CREATE', 'Registrar ventas o contratos'),
                                                    (gen_random_uuid(), 'SALES_VIEW', 'Ver ventas o contratos'),
                                                    (gen_random_uuid(), 'SALES_UPDATE', 'Editar ventas o contratos'),
                                                    (gen_random_uuid(), 'SALES_CANCEL', 'Cancelar ventas o contratos'),

                                                    (gen_random_uuid(), 'REPORTS_VIEW', 'Visualizar reportes'),
                                                    (gen_random_uuid(), 'REPORTS_EXPORT', 'Exportar reportes');
