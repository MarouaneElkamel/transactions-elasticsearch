import { Moment } from 'moment';

export interface ITransaction {
    id?: number;
    transid?: string;
    transtype?: string;
    fromacct?: string;
    status?: string;
    destination?: string;
    amount?: number;
    fee?: number;
    timestamp?: Moment;
}

export class Transaction implements ITransaction {
    constructor(
        public id?: number,
        public transid?: string,
        public transtype?: string,
        public fromacct?: string,
        public status?: string,
        public destination?: string,
        public amount?: number,
        public fee?: number,
        public timestamp?: Moment
    ) {}
}
