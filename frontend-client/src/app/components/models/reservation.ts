import { User } from "../user/user";

export class Reservation {
    constructor(
        public datumDolaska: Date,
        public datumOdlaska: Date,
        public cena?: number,
        public user?: User,
        public izvrsena?: boolean,
        public id?: string

    ) {}
}